// forma de criar um elemento html

class CardNews extends HTMLElement {
    constructor() {// contructor() erda a classe CardNews
        super(); // super() erda HTMLElement
        const shadow = this.attachShadow({ mode: "open"});
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
    }

    build() {
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card");
        
        const cardLeft = document.createElement("div");
        cardLeft.setAttribute("class", "card_left");

        const autor = document.createElement("span");
        autor.textContent = "By " + (this.getAttribute("autor") || "Anonymous");
        const linkTitle = document.createElement("a");
        linkTitle.textContent = this.getAttribute("title");
        linkTitle.href = this.getAttribute("link-url");
        const newsContent = document.createElement("p");
        newsContent.textContent = this.getAttribute("content");

        cardLeft.appendChild(autor);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(newsContent);

        const cardRight = document.createElement("div");
        cardRight.setAttribute("class", "card_right");
        const newsImage = document.createElement("img");
        newsImage.src = this.getAttribute("photo") || "./src/img/darth-vader-vilao-de-star-wars-1603244856543_v2_4x3.jpg";
        newsImage.alt = "Foto da noticia";

        cardRight.appendChild(newsImage);

        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);
        
        return componentRoot;
    }

    styles() {
        const style = document.createElement("style");
        style.textContent = `
         .card{
             width: 720px;
             border: 1px solid gray;
             display: flex;
             flex-direction: row;
         }
         
         .card_left, .card_rigth{
             border: 1px solid blue;
         }
         
         .card_left{
             display: flex;
             flex-direction: column;
             justify-content: center;
             padding: 10px;
         }
         
         .card_left > span{
             font-weight: 400;
         }

         .card_left > a{
            margin-top: 15px;
            font-size: 25px;
            color: black;
            text-decoration: none;
            font-weight: bold;
        }
         
         img{
             width: 335px;
             height: 200px;
         }
         
         .card_left > h1{
             margin-top: 15px;
             font-size: 25px;
         }
         
         .card_left > p{
             color: rgb(70, 70, 70);
         }
        `

        return style;
    }
}

customElements.define("card-news", CardNews);
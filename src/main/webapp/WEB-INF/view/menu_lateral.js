
const botaoMenu = document.querySelector('.cabecalho__menu');
const menu = document.querySelector('.menu_lateral');


botaoMenu.addEventListener('click', () => {
    menu.classList.toggle('menu-lateral--ativo');
})

function rota() {
    alert("voce clicou no botão da rota");
}

function menu() {
    var menu = document.querySelector('.menu_lateral');
    menu.classList.toggle('.menu_lateral--ativo')
}
// 버튼 누르면 모달 켜기
const modalWrap = document.getElementById("modalWrap")
const openModal = document.getElementById("open-modal")
openModal.addEventListener("click", e => {
    modalWrap.style.display = "flex"
})

//버튼 누르면 모달 끄기
const closeModal = document.getElementById("close-modal")
closeModal.addEventListener("click",e => {
    modalWrap.style.display = "none"
})
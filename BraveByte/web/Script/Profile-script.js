const passwordChange = document.querySelector('.edit-pass'); 
const passwordChangeField = document.querySelector('.change-password_backgr');
const editInfo = document.querySelector('.edit-info'); 
const infos = document.querySelectorAll('.basic-info1 input'); 
const closeButton = document.querySelector('.close'); 
const confirmChange = document.querySelector('.confirm-change'); 
const submitinfo = document.querySelector('#info-submit');

passwordChange.addEventListener('click', function(event) {
    event.preventDefault(); 
    passwordChangeField.style.display = 'flex';
});
closeButton.addEventListener('click', function(event) {

    passwordChangeField.style.display = 'none';
    event.sstopPropagation();
});

/////// CHÚ Ý NÚT NÀY NHA THƯƠNG 

confirmChange.addEventListener('click', function(event) {

    passwordChangeField.style.display = 'none';
    event.sstopPropagation();
});


editInfo.addEventListener('click', function(event) {

    if (infos[0].readOnly)
    {
        infos.forEach(info => {
            info.style.pointerEvents = 'auto';
            info.readOnly = false;
        });

        editInfo.innerHTML = "Done";
                submitinfo.style.display = "block";

    }
    else {
        infos.forEach(info => {
            info.style.pointerEvents = 'none';
            info.readOnly = true;
        });
        
        editInfo.innerHTML = 'Edit information <ion-icon name="create-outline"></ion-icon>';
submitinfo.style.display = "none";
    }


});

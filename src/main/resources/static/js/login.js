$(function() {
    
    /* 정보가 들어있는지 확인 후 submit */
    $('.login-btn').on('click', () => {
        if(!$('input[name=userName]').val()) {
            // alert('이름을 입력해주세요.');
            $('.text').text('이름을 입력해주세요');
            $('.modal-container').css('display', 'flex');
            return;
        }

        if(!$('input[name=phoneNumber]').val()) {
            // alert('전화번호를 입력해주세요.');
            $('.text').text('전화번호를 입력해주세요');
            $('.modal-container').css('display', 'flex');
            return;
        }

        document.loginForm.submit();
    });

    $('.modal-btn').on('click', () => {
        $('.modal-container').hide();
    });

});
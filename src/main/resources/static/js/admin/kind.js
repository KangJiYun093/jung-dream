$(function() {
    $('#insert-button').on('click', () => {

        if(!$('input[name=productRegistrationName]').val()) {
            alert('품종 이름을 입력하세요');
            return;
        }

        document.productRegistrationInsertForm.submit();
    });
});
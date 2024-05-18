$(function() {

    productRegistrations.forEach(productRegistration => {
        let text = `
            <tr class="registration-list list">
                <input type="hidden" value="${productRegistration.productRegistrationId}" id="product-registration-id" class="id">
                <td><input type="checkbox" name="check"></td>
                <td>${productRegistration.productRegistrationName}</td>
                <td>${productRegistration.productRegistrationSpecification}</td>
                <td>${productRegistration.productRegistrationWeight}</td>
                <td>${productRegistration.productRegistrationQuantity}</td>
                <td>${productRegistration.productRegistrationPrice}</td>
            </tr>
        `;

        $('.kind-content').append(text);
    });

    $('.registration-list').on('click', function() {
        $productRegistrationId = $(this).find('#product-registration-id').val();

        $.ajax({
            url: "/admins/kind/get-registration",
            type: "post",
            data: { productRegistrationId : $productRegistrationId },
            success: function(result) {
                if(result) {
                    $('#edit-modal').find('input[name=productRegistrationId]').val(result.productRegistrationId);
                    $('#edit-modal').find('input[name=productRegistrationName]').val(result.productRegistrationName);

                    if(result.productRegistrationSpecification == 'Y') {
                        $('#edit-modal').find('input[name=productRegistrationSpecification]').prop('checked', true);
                    } else {
                        $('#edit-modal').find('input[name=productRegistrationSpecification]').prop('checked', false);
                    }
                    if(result.productRegistrationWeight == 'Y') {
                        $('#edit-modal').find('input[name=productRegistrationWeight]').prop('checked', true);
                    } else {
                        $('#edit-modal').find('input[name=productRegistrationWeight]').prop('checked', false);
                    }
                    if(result.productRegistrationQuantity == 'Y') {
                        $('#edit-modal').find('input[name=productRegistrationQuantity]').prop('checked', true);
                    } else {
                        $('#edit-modal').find('input[name=productRegistrationQuantity]').prop('checked', false);
                    }
                    if(result.productRegistrationPrice == 'Y') {
                        $('#edit-modal').find('input[name=productRegistrationPrice]').prop('checked', true);
                    } else {
                        $('#edit-modal').find('input[name=productRegistrationPrice]').prop('checked', false);
                    }

                    $('#edit-modal').show();
                }
            }
        });
    });

    $('#insert-button').on('click', () => {

        if(!$('#insert-name').val()) {
            alert('품종 이름을 입력하세요');
            return;
        }

        document.productRegistrationInsertForm.submit();
    });

    $('#edit-button').on('click', () => {

        if(!$('#update-name').val()) {
            alert('품종 이름을 입력하세요');
            return;
        }

        document.productRegistrationUpdateForm.submit();
    });
});
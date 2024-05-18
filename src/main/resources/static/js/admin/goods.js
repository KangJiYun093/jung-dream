/* 이미지 팝업 모달 */
$(document).ready(function() {

    products.forEach(product => {
        let text = `
            <li class="goods list">
                <input type="checkbox" name="check">
                <input type="hidden" class="id" name="productId" value="${product.productId}">
                <div class="thumb">
                    <img src="/files/display?fileName=${product.productFilePath}">
                </div>
                <p class="goods-name">${product.productTitle}</p>
                <p class="goods-registration-name">${product.productRegistrationName}</p>
                <p class="goods-sales-unit">${product.productSalesUnit}</p>
            </li>
        `;

        $('.goods-list').append(text);
    });

    $('.goods').on('click', function() {
        $.ajax({
            url: "/admins/get/product",
            type: "post",
            data: { productId : $(this).find('input[name=productId]').val() },
            success: function(result) {
                if(result) {
                    console.log(result);

                    let updateModal = `
                        <div class="detail-content">
                            <p>상품 상세 페이지</p>
                            <form action="" method="post">
                                <div class="detail-wrapper">
                                    <div class="form-group">
                                        <label>품종</label> 
                                        <input type="hidden" class="form-control" name="productRegistrationId" value="${result.productRegistrationId}">
                                        <input type="text" class="form-control" name="productRegistrationName" value="${result.productRegistrationName}" readonly>
                                    </div>
                                    <div class="form-group">
                                        <label>제목</label> 
                                        <input type="text" class="form-control" name="productTitle" value="${result.productTitle}">
                                    </div>
                                    <div class="form-group">
                                        <label>판매자</label> 
                                        <input type="text" class="form-control" name="productSeller" value="${result.productSeller}">
                                    </div>
                                    <div class="form-group">
                                        <label>판매단위</label> 
                                        <input type="text" class="form-control" name="productSalesUnit" value="${result.productSalesUnit}">
                                    </div>
<!--                                    <div class="form-group">-->
<!--                                        <label>중량/용량</label> -->
<!--                                        <input class="form-control" name="weigh-detail">-->
<!--                                    </div>-->
                                    <div>
                                    <!--<div class="option-kind">-->`;

                    let productOptions = result.productOptionVOS;

                    productOptions.forEach(productOption => {
                        let option = `
                            <div class="option-kind">
                            `;
                            if(productOption.productOptionSpecification) {
                                option += `
                                    <div class="form-group">
                                        <label>규격</label>
                                        <input type="text" class="form-control" name="productOptionSpecification" value="${productOption.productOptionSpecification}">
                                    </div>
                                `;
                            }
                            if(productOption.productOptionWeight) {
                                option += `
                                    <div class="form-group">
                                        <label>키로수</label>
                                        <input type="text" class="form-control" name="productOptionWeight" value="${productOption.productOptionWeight}">
                                    </div>
                                `;
                            }
                            if(productOption.productOptionQuantity) {
                                option += `
                                    <div class="form-group">
                                        <label>개수</label>
                                        <input type="text" class="form-control" name="productOptionQuantity" value="${productOption.productOptionQuantity}">
                                    </div>
                                `;
                            }
                            if(productOption.productOptionPrice) {
                                option += `
                                    <div class="form-group">
                                        <label>가격</label>
                                        <input type="text" class="form-control" name="productOptionPrice" value="${productOption.productOptionPrice}">
                                    </div>
                                `;
                            }
                        option += `</div>`;

                        updateModal += option;
                    });
                                updateModal += `
<!--                                    </div>-->
                                    </div>
                                    <div class="form-group">
                                        <div class="detail-images">
                                            <label>첨부 파일</label>
                                            <label for="update-first">
                                                <span class="image-div">
                                                    <img src="/files/display?fileName=${result.productFileVOS[0].filePath}">
                                                </span>
                                                <input type="file" class="image-upload" accept="image/*" id="update-first" style="display: none">
                                                <input type="hidden" class="uuid">
                                                <input type="hidden" class="filePath">
                                            </label>
                                            <label for="update-second">
                                                <span class="image-div">
                                                    <img src="/files/display?fileName=${result.productFileVOS[1].filePath}">
                                                </span>
                                                <input type="file" class="image-upload" accept="image/*" id="update-second" style="display: none">
                                                <input type="hidden" class="uuid">
                                                <input type="hidden" class="filePath">
                                            </label>
                                            <label for="update-third">
                                                <span class="image-div">
                                                    <img src="/files/display?fileName=${result.productFileVOS[2].filePath}">
                                                </span>
                                                <input type="file" class="image-upload" accept="image/*" id="update-third" style="display: none">
                                                <input type="hidden" class="uuid">
                                                <input type="hidden" class="filePath">
                                            </label>
                                            <label for="update-fourth">
                                                <span class="image-div">
                                                    <img src="/files/display?fileName=${result.productFileVOS[3].filePath}">
                                                </span>
                                                <input type="file" class="image-upload" accept="image/*" id="update-fourth" style="display: none">
                                                <input type="hidden" class="uuid">
                                                <input type="hidden" class="filePath">
                                            </label>
                                            <label for="update-fifth">
                                                <span class="image-div">
                                                    <img src="/files/display?fileName=${result.productFileVOS[4].filePath}">
                                                </span>
                                                <input type="file" class="image-upload" accept="image/*" id="update-fifth" style="display: none">
                                                <input type="hidden" class="uuid">
                                                <input type="hidden" class="filePath">
                                            </label>
                                        </div>
                                    </div>
                                    <div class="modal-buttons">
                                        <button class="confirm-btn">수정</button>
                                        <button type="button" class="cancel-btn">취소</button>
                                    </div>
                                </div>
                        </div>
                    `;

                    $('#detail-modal').append(updateModal);
                    $('#detail-modal').show();
                }
                // document.location.reload(true);
            }
        });

    });

    /* 등록하기 */
    let text = `<div class="option-kind option-class" id="insert-option-kind">`;

    if (productRegistrations[0].productRegistrationSpecification == 'Y') {
        text += `
            <div class="form-group">
                <label>규격</label>
                <input type="text" class="form-control" name="option">
            </div>
        `;
    }
    if (productRegistrations[0].productRegistrationWeight == 'Y') {
        text += `
            <div class="form-group">
                <label>키로수</label>
                <input type="text" class="form-control" name="weight">
            </div>
        `;
    }
    if (productRegistrations[0].productRegistrationQuantity == 'Y') {
        text += `
            <div class="form-group">
                <label>개수</label>
                <input type="text" class="form-control" name="count">
            </div>
        `;
    }
    if (productRegistrations[0].productRegistrationPrice == 'Y') {
        text += `
            <div class="form-group">
                <label>가격</label>
                <input type="text" class="form-control" name="price">
            </div>
        `;
    }
    text += `
            <div class="plus-min-btn">
                <img class="plus-btn" src="/image/admin/plus.png">
                <img class="minus-btn" src="/image/admin/minus.png">
            </div>
        </div>
    `;

    $('#product-kind').on('change', function() {
        $productRegistrationId = $(this).val();

        productRegistrations.forEach(productRegistration => {
            if(productRegistration.productRegistrationId != $productRegistrationId) {
                return;
            }

            text = `<div class="option-kind option-class" id="insert-option-kind">`;

            if(productRegistration.productRegistrationSpecification == 'Y') {
                text += `
                    <div class="form-group">
                        <label>규격</label>
                        <input type="text" class="form-control" name="option">
                    </div>
                `;
            }
            if(productRegistration.productRegistrationWeight == 'Y') {
                text += `
                    <div class="form-group">
                        <label>키로수</label>
                        <input type="text" class="form-control" name="weight">
                    </div>
                `;
            }
            if(productRegistration.productRegistrationQuantity == 'Y') {
                text += `
                    <div class="form-group">
                        <label>개수</label>
                        <input type="text" class="form-control" name="count">
                    </div>
                `;
            }
            if(productRegistration.productRegistrationPrice == 'Y') {
                text += `
                    <div class="form-group">
                        <label>가격</label>
                        <input type="text" class="form-control" name="price">
                    </div>
                `;
            }
            text += `
                <div class="plus-min-btn">
                    <img class="plus-btn" src="/image/admin/plus.png">
                    <img class="minus-btn" src="/image/admin/minus.png">
                </div>
            </div>
            `;

            $('.option-group').html(text);
        });
    });

    $(document).on('click', '.plus-btn', function() {
        $(this).parents('#insert-option-kind').after(text);
    });

    $(document).on('click', '.minus-btn', function() {
        $(this).parents('.option-kind').remove();
    });

    $('.image-upload').on('change', function() {
        let $file = $(this)[0].files[0];
        let $input = $(this); // this를 저장

        let formData = new FormData(); //폼객체
        formData.append('file', $file);

        $.ajax({
            url: "/files/upload",
            method: "post",
            data: formData,
            contentType:false,
            processData:false,
            success: function(result) {
                $input.next().val(result.uuids[0]);
                $input.next().next().val(result.paths[0]);
                $input.parent().find('.image-div').empty();
                $input.parent().find('.image-div').append($(`<img src="/files/display?fileName=${result.paths[0]}">`));
            }
        });
    });

    /* 등록 버튼 클릭 */
    $('#insert-button').on('click', () => {
        if(!$('input[name=title]').val()) {
            alert('제목을 입력하세요');
            return;
        }

        if(!$('input[name=name]').val()) {
            alert('판매자 이름을 입력하세요');
            return;
        }

        if(!$('input[name=salesUnit]').val()) {
            alert('판매 단위를 입력하세요');
            return;
        }

        let productOptionVOS = [];
        if($('input[name=option]').length > 0) {
            for (let i = 0; i < $('input[name=option]').length; i++) {
                if(!$('input[name=option]').eq(i).val()) {
                    alert('규격을 입력하세요');
                    return;
                }
                if (!productOptionVOS[i]) {
                    productOptionVOS[i] = {};
                }
                productOptionVOS[i]["productOptionSpecification"] = $('input[name=option]').eq(i).val();
            }
        }

        if($('input[name=weight]').length > 0) {
            for (let i = 0; i < $('input[name=weight]').length; i++) {
                if(!$('input[name=weight]').eq(i).val()) {
                    alert('키로수를 입력하세요');
                    return;
                }
                if (!productOptionVOS[i]) {
                    productOptionVOS[i] = {};
                }
                productOptionVOS[i]["productOptionWeight"] = $('input[name=weight]').eq(i).val();
            }
        }

        if($('input[name=count]').length > 0) {
            for (let i = 0; i < $('input[name=count]').length; i++) {
                if(!$('input[name=count]').eq(i).val()) {
                    alert('개수를 입력하세요');
                    return;
                }
                if (!productOptionVOS[i]) {
                    productOptionVOS[i] = {};
                }
                productOptionVOS[i]["productOptionQuantity"] = $('input[name=count]').eq(i).val();
            }
        }

        if($('input[name=price]').length > 0) {
            for (let i = 0; i < $('input[name=price]').length; i++) {
                if(!$('input[name=price]').eq(i).val()) {
                    alert('가격을 입력하세요');
                    return;
                }
                if (!productOptionVOS[i]) {
                    productOptionVOS[i] = {};
                }
                productOptionVOS[i]["productOptionPrice"] = $('input[name=price]').eq(i).val();
            }
        }

        let fileNames = [];
        for (let i = 0; i < $('.image-upload').length; i++) {
            if(!$('.image-upload').eq(i).val()) {
                alert('사진 5개를 모두 넣어주세요');
                return;
            }
            fileNames[i] = $('.image-upload').eq(i).val().split('\\')[2];
        }

        let productVO =
        {
            productSalesUnit : $('input[name=salesUnit]').val(),
            productTitle : $('input[name=title]').val(),
            productSeller : $('input[name=name]').val(),
            productRegistrationId : $('#product-kind option:selected').val()
        };

        let productFileVOS = [];
        $('.uuid').each((i, e) => {
            productFileVOS[i] = { uuid : $('.uuid').eq(i).val(), filePath : $('.filePath').eq(i).val(), fileName : fileNames[i] }
        });

        $.ajax({
            url: "/admins/product/save",
            type: "post",
            contentType: "application/json",
            data: JSON.stringify({
                productVO: productVO,
                productOptionVOS: productOptionVOS,
                productFileVOS: productFileVOS
            }),
            success: function() {
                document.location.reload(true);
            }
        });
    });

});

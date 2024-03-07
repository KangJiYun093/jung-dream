//공지사항
$(() => {
    $("#tit-anno, #tit-center").on("click", () => {
        console.log("Click event triggered");
        location.href = "../customer/cust-notice.html";
    });
});

//1:1문의 작성 폼
$(() => {
    $("#tit-inForm").on("click", () => {
        console.log("Click event triggered");
        location.href = "../customer/cust-inquiry-form.html";
    });
});

//1:1문의내역
$(() => {
    $("#tit-inForm-list").on("click", () => {
        console.log("Click event triggered");
        location.href = "../customer/cust-inquiry-list.html";
    });
});

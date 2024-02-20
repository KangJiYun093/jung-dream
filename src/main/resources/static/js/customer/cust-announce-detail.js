$(() => {
    $("#announce-list").on("click", () => {
        console.log("Click event triggered");
        location.href = "../customer/cust-announce.html";
    });
});
/**
 * 
 */

 function submitAddForm() {
    var formData = {
        name: $("input[name='name']").val(),
        price: $("input[name='price']").val(),
        // Thêm các trường khác tương tự
    };

    $.ajax({
        type: "POST",
        url: "/admin/courses",
        data: JSON.stringify(formData),
        contentType: "application/json",
        success: function () {
            closeAddModal();
            location.reload();
        }
    });
}

// Function to submit the edit form
function submitEditForm() {
    var formData = {
        id: $("input[name='id']").val(),
        name: $("input[name='name']").val(),
        price: $("input[name='price']").val(),
        // Thêm các trường khác tương tự
    };

    $.ajax({
        type: "PUT",
        url: "/admin/courses/" + formData.id,
        data: JSON.stringify(formData),
        contentType: "application/json",
        success: function () {
            closeEditModal();
            location.reload();
        }
    });
}

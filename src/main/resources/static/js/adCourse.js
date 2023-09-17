


 function saveAddForm() {
        var name = $("#addName").val();
        var price = $("#addPrice").val();
        var teacherId = $("#addTeacherId").val();
        var linkOnline = $("#addLinkOnline").val();
        var description = $("#addDescription").val();
		
		alert("..lỗi" + name);
        
        

        $.ajax({
            type: "GET",
            contentType : "application/json",
            url: "/admin/course/add",
            data: {name:name,price:price,teacherId:teacherId,linkOnline:linkOnline,description:description},
            dataType: 'json',
            success: function(data) {
                if (data === "Success") {
                    closeAddModal();
                } else {
                    console.log("Lỗi: Không thể thêm khóa học.");
                }
            },
            error: function() {
                console.log("Lỗi: Không thể kết nối với máy chủ.");
            }
        });
        
    }

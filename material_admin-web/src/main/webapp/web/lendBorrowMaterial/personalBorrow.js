var pageSize = 13;
getBorrowMaterial(1);


function getBorrowMaterial(pageNum){
    $.ajax({
        type:"GET",
        url:"/lendBorrow/getBorrowMaterial",
        data:"pageNum="+pageNum+"&pageSize="+pageSize,
        success:function(data){
            if(data.code === 200){
                showBorrowMaterial(data.data);
                totalPage = Math.floor(data.page.total/pageSize)+1;
                showPage(totalPage);
            }else if(data.code === 411){
                window.location.href = "/web/login.html"
            }else{
                alert(data.msg);
            }
        },
        error:function(xhr){
            console.log(xhr);
            alert("程序错误");
        }
    });
}

function showPage(totalPage){
    var page = totalPage >20? 20:totalPage;
    var div = $("#div-page");
    div.children().hide();
    for(var i=page;i>=1;i--){
        div.prepend('<li><a href="#" onclick="getBorrowMaterial('+i+')">'+i+'</a></li>');
    }
}
function showBorrowMaterial(list){
    $(".tr-data").hide();
    for(var i=0;i<list.length;i++){
        var status = list[i].ackRevertStNum === ''? "未归还":"已归还";
        var prepend = '<tr class="tr-data">'+
            '<td>'+list[i].materialName+'</td>'+
            '<td>'+list[i].materialOrg+'</td>'+
            '<td>'+list[i].number+'</td>'+
            '<td>'+list[i].lendName+'</td>'+
            '<td>'+list[i].lendPhoneNum+'</td>'+
            '<td>'+list[i].operationTime+'</td>'+
            '<td>'+list[i].promiseTime+'</td>'+
            '<td>'+list[i].ackRevertStNum+'</td>'+
            '<td>'+status+'</td>'+
            '</tr>';
        $("#orgMaterial").prepend(prepend);
    }
}
$(document).ready(function() {
    $("#list_hero").bootstrapTable({
        columns: [{
            field: 'id',
            title: '序号'
        }, {
                field: 'nickname',
                title: '英雄称号'
        },{
            field: 'name',
            title: '英雄名称'
        }, {
            field: 'v_rate',
            title: '胜率'
        },{
            field: 'a_rate',
            title: '出场率'
        }]
    })
        getDetail("2014")
}
);

function getDetail(version){

    // var target = event.target;
    // var td = target.parentNode;
    // var tr = td.parentNode;
    // var tds = tr.getElementsByTagName("td")[0];
    // console.log(tds.innerHTML);
    $("#versionTest").text(version)
    $.ajax({
        type: 'POST',
        url: '/allChampion',
        data:{version:version},
        dataType: 'json',
        beforeSend:function(){
            $("#ajax-waiting").css('display','block');
        },
        success: function (result) {
            $("#ajax-waiting").css('display','none');
            $("#timeSpan").text(result.timeSpan)
            var jsonData=[]
            heroList=result.heroList
            $.each(heroList, function (i, item) {
                var temp={}
                temp.id=i
                temp.nickname=item.nickname
                //temp.name="<a href=\"javascript:void(0)\">"+item.name+"</a>"
                temp.name="<a href='javascript:void(0)' onclick=heroDetail("+"\'" + item.name +"\'"+ ")>"+""+item.name+""+"</a>" ;
                temp.v_rate=item.v_rate
                temp.a_rate=item.a_rate
                jsonData.push(temp)
            })
            $("#list_hero").bootstrapTable('load',jsonData)
        },
        error : function() {
            $("#ajax-waiting").css('display','none');
            alert("error")
        }
    });
}


function getDetailByView(version){
    v=$("#versionTest").text()
    console.log(v)
    $.ajax({
        type: 'POST',
        url: '/allChampionByView',
        data:{version:v},
        dataType: 'json',
        beforeSend:function(){
            $("#ajax-waiting").css('display','block');
        },
        success: function (result) {
            $("#ajax-waiting").css('display','none');
            $("#timeSpan_view").text(result.timeSpan)
            var jsonData=[]
            heroList=result.heroList
            $.each(heroList, function (i, item) {
                var temp={}
                temp.id=i
                temp.nickname=item.nickname
                //temp.name="<a href=\"javascript:void(0)\">"+item.name+"</a>"
                temp.name="<a href='javascript:void(0)' onclick=heroDetail("+"\'" + item.name +"\'"+ ")>"+""+item.name+""+"</a>" ;
                temp.v_rate=item.v_rate
                temp.a_rate=item.a_rate
                jsonData.push(temp)
            })
            $("#list_hero").bootstrapTable('load',jsonData)
        },
        error : function() {
            $("#ajax-waiting").css('display','none');
            alert("error")
        }
    });
}


function heroDetail(data){
    console.log(data);
    sessionStorage.setItem("hero_now",data);
    window.location.href="/heroDetail"
}
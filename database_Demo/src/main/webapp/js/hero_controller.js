$(document).ready(function(){
        $("#heroDetailList").bootstrapTable({
            columns:[{
                field:'version',
                title:'年份'
            },{
                field:'ave_k',
                title:'AVE KILL'
            },{
                field:'ave_d',
                title:'AVE DEATH'
            },{
                field:'ave_a',
                title:'AVE ASSIST'
            }]
            // {
            //     field:'position',
            //     title:'POSITION'
            // },{
            //     field:'best d',
            //     title:'skill in d'
            // },{
            //     field:'best f',
            //     title:'skill in f'
            // },{
            //     field:'ban rate',
            //     title:'ban rate'
            // }
        })
    var hero_now=sessionStorage.getItem("hero_now");
        heroDetail(hero_now)
    }
);

function searchHeroDetail() {
    data=$("#heroName").val()
    heroDetail(data)

}

function heroDetail(data){
    console.log(data);
    $("#heroName").val(data)
    sessionStorage.setItem("hero_now",data);
    $.ajax({
        type: 'POST',
        url: '/heroDetailData',
        data: {heroName: data},
        dataType: 'json',
        beforeSend:function(){
            $("#ajax-waiting").css('display','block');
        },
        success: function (result) {
            $("#ajax-waiting").css('display','none');
            $("#timeSpan").text(result.timeSpan)
            var vrateList=[]
            var versionlist=[]
            var jsonData=[]
            heroDetailList=result.heroDetailList
            $.each(heroDetailList, function (i, item) {
                var temp={}
                temp.version=item.version
                temp.ave_k=item.ave_k
                temp.ave_d=item.ave_d
                temp.ave_a=item.ave_a
                jsonData.push(temp)
                vrateList.push(item.v_rate*100)
                versionlist.push(item.version)
            })

            $("#heroDetailList").bootstrapTable('load',jsonData)
            console.log(vrateList)
            drawCanvas(vrateList,versionlist)

        },
        error: function () {
            $("#ajax-waiting").css('display','none');
            alert("error");
        }
    })
}


function drawCanvas(data,versionlist){
    var ctx = document.getElementById("myChart").getContext('2d');
    var myChart = new Chart(ctx, {
        //type: 'bar',
        type: 'line',
        data: {
            labels: versionlist,
            datasets: [{
                label: '英雄胜率曲线',
                data: data,
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    // 'rgba(153, 102, 255, 0.2)',
                    // 'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    // 'rgba(153, 102, 255, 1)',
                    // 'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero:true
                    }
                }]
            }
        }
    });
}

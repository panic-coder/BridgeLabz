app.filter('filterDashboard',function(){
  return function(item,detail,storage){
    //console.log(detail);
    //console.log(item);
    //console.log(storage);
    var sortedHai = [];
    var values;
    var company;
    var memory;
    var index;
    var count=0;
    if(item!=undefined){
    for (var i = 0; i < item.length; i++) {
      values = item[i];

      //console.log(values);
      if (detail!=undefined) {
      for (var j = 0; j < detail.length; j++) {
        company = detail[j];
        //console.log(select);
        if(company == item[i].specs.manufacturer){
          //index = sortedHai.indexOf(values);
          //if(index==-1){
            sortedHai.push(values);
            count++;
          //}
        }
      }
    }
    if (count>0) {

    if(storage!=undefined){
    for (var k = 0; k < sortedHai.length; k++) {
      memory = sortedHai[k];
      //console.log(memory);
      if(storage == sortedHai[k].specs.storage){
        index = sortedHai.indexOf();
        console.log(sortedHai);
        console.log(index);
        // if (index == -1) {
        //   sortedHai.push(values);
        //   count++;
        // }
        if(index>-1){
          sortedHai.splice(index,1);
          count++;
          break;

        }
        else {
          sortedHai.push(memory);
          count++;
          break;

        }

      }
    }

  }
}
}
}



if(count>0){
  return sortedHai;
}
else {
  //sortedHai = item;
  return item;
}
//console.log(sortedHai);

}

  }

)

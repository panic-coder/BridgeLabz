app.filter('removeDuplicate',function(){
  return function(items,detail){
    var index;
    var values;
    var array=[];
    if(items != undefined)
    {
    for(var i=0;i<items.length;i++){
      values = items[i].specs[detail];
      index = array.indexOf(values);
      if(index==-1){
        array.push(values);
      }
    }
  }
    //console.log(array);
    return array;
  };
});

// app.filter('removeDuplicate',function(){
//
//   return function (items, detail) {
//
//     //console.log(detail);
//     if(items!=undefined){
//    var filtered = [];
//    var index;
//    var value;
//    for (var i = 0; i < items.length; i++) {
//      value = items[i].specs[detail];
//      index = filtered.indexOf(value);
//      if(index==-1)
//        filtered.push(value);
//    }
//    // console.log(filtered);
//    return filtered;
//  }
// }
// });

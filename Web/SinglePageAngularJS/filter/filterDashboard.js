app.filter('filterDashboard',function(){
  return function(item,maker,storage,operating,camera){

    var sortedHai = [];
    var array = [];
    var values;
    var company;
    var memory;
    var index;
    var count=0;

    if(maker.length!=0 || storage.length!=0 || operating.length!=0 || camera.length!=0){
      // console.log(maker);
      // console.log(storage);
      // console.log(operating);
      // console.log(camera);
      if (maker.length!=0) {
        //console.log(maker);
        for (var i = 0; i < item.length; i++) {
          for (var j = 0; j < maker.length; j++) {
            if(maker[j]==item[i].specs.manufacturer){
              //console.log(maker);
              sortedHai.push(item[i]);
            }
          }
        }
        //console.log(sortedHai);
      }
      else {
        sortedHai = item;
      }

      if (storage.length!=0) {
        for (var i = 0; i < sortedHai.length; i++) {
          for (var j = 0; j < storage.length; j++) {
            if(storage[j]==sortedHai[i].specs.storage){
                array.push(sortedHai[i]);
              }
            }
          }
          sortedHai = array;
          array = [];
        }

        if (operating.length!=0) {
          for (var i = 0; i < sortedHai.length; i++) {
            for (var j = 0; j < operating.length; j++) {
              if (operating[j]==sortedHai[i].specs.os) {
                array.push(sortedHai[i]);
              }
            }
          }
          sortedHai = array;
          array = [];
        }

        if (camera.length!=0) {
          for (var i = 0; i < sortedHai.length; i++) {
            for (var j = 0; j < camera.length; j++) {
              if (camera[j]==sortedHai[i].specs.camera) {
                array.push(sortedHai[i]);
              }
            }
          }
          sortedHai = array;
          array = [];
        }
      return sortedHai;
    }
    //console.log(sortedHai);
    else {
      return item;
    }

  }
})

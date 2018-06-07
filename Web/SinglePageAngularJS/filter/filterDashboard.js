app.filter('filterDashboard', function() {
  var sortedHai = [];
  var array = [];
  var values;
  return function(item, maker, storage, operating, camera) {
    //console.log(fav);
    if (maker.length != 0 || storage.length != 0 || operating.length != 0 || camera.length != 0 ) {
      //console.log(fav);
      if (maker.length != 0) {
        sortedHai = adding(item, maker, 'manufacturer');
      } else {
        sortedHai = item;
      }
      if (storage.length != 0) {
        sortedHai = adding(sortedHai, storage, 'storage');
      }
      if (operating.length != 0) {
        sortedHai = adding(sortedHai, operating, 'os');
      }
      if (camera.length != 0) {
        sortedHai = adding(sortedHai, camera, 'camera');
      }
      // if (fav != undefined) {
      //   sortedHai = fav;
      // }
      return sortedHai;
    }
    // else if (fav.length != 0) {
    //   console.log(fav);
    //   return fav;
    // }
    else {
        return item;
    }
  }

  function adding(sortedHai, camera, value) {
    for (var i = 0; i < sortedHai.length; i++) {
      for (var j = 0; j < camera.length; j++) {
        if (camera[j] == sortedHai[i].specs[value]) {
          array.push(sortedHai[i]);
        }
      }
    }
    sortedHai = array;
    array = [];
    return sortedHai
  }
})

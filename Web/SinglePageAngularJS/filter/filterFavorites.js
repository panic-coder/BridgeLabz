app.filter('filterFavourite', function($state){
  return function(item,fav){
    // console.log(fav);
    if (fav != undefined) {
      return fav;
    }
    else {
      $state.go('home.dashboard')
    }
  }
})

app.controller('dashboardCtr', function($scope,$mdDialog,$rootScope) {

////console.log("dashboard");
// $filter('currency')(amount, symbol, fractionSize)

$scope.showAdvanced = function(presentData) {
  //console.log(presentData);
    $mdDialog.show({
      controller: 'dialogCtr',
      templateUrl: 'templates/popup.html',
      parent: angular.element(document.body),
      //targetEvent: ev,
      clickOutsideToClose:true,
      locals:{
        phoneData: presentData
      }
    })}

    $scope.cancel = function() {
        $mdDialog.cancel();
    }
//var v;



$rootScope.favouriteElements = [];
$rootScope.favouriteElements = localRead();
//console.log($rootScope.favouriteElements);
// JSON.parse(localStorage.getItem('cart'));;
//$rootScope.favouriteElements = $scope.locals.cart;
$scope.favourite = function(favouriteData){

var result = localRead();
console.log(result);
if(result != null){
  $rootScope.favouriteElements;
}
// var show = localRead();
// console.log(show);
//localStorage.removeItem('key');

  var index;
  index = $rootScope.favouriteElements.indexOf(favouriteData);
  console.log(index);
  if(index==-1){
    $rootScope.favouriteElements.push(favouriteData);
    localStorage.setItem('key',JSON.stringify($rootScope.favouriteElements));
  }


  // locals:{
  //   cart = $rootScope.favouriteElements;
  // }
  // $scope.locals.cart = cart;
  //v = $rootScope.favouriteElements;
  //console.log('d',$rootScope.favouriteElements);
  //console.log(z);

  function localRead(){
    return JSON.parse(localStorage.getItem('key'));
  }

}
function localRead(){
  return JSON.parse(localStorage.getItem('key'));
}

});

app.controller('dialogCtr',function ($scope, $mdDialog, locals) {
    //Assigned from construction <code>locals</code> options...
    $scope.locals = locals.phoneData;
    $scope.rate = locals.phoneData.rating;
    console.log($scope.rate);
    //console.log(locals);
  })

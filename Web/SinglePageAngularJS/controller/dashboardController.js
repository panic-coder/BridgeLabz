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
//$rootScope.favouriteElements = $scope.locals.cart;
$scope.favourite = function(favouriteData){
  //$rootScope.favouriteElements = v;
  // if(locals.length != 0){
  //
  // }

  var index;
  index = $rootScope.favouriteElements.indexOf(favouriteData);
  if(index==-1){
    $rootScope.favouriteElements.push(favouriteData);
  }
  // locals:{
  //   cart = $rootScope.favouriteElements;
  // }
  // $scope.locals.cart = cart;
  //v = $rootScope.favouriteElements;
}
});

app.controller('dialogCtr',function ($scope, $mdDialog, locals) {
    //Assigned from construction <code>locals</code> options...
    $scope.locals = locals.phoneData;
    $scope.rate = locals.phoneData.rating;
    console.log($scope.rate);
    //console.log(locals);
  })

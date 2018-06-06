app.controller('dashboardCtr', function($scope,$mdDialog,$rootScope) {

//console.log("dashboard");

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

$rootScope.favouriteElements = [];
$scope.favourite = function(favouriteData){
  var index;
  index = $rootScope.favouriteElements.indexOf(favouriteData);
  if(index==-1){
    $rootScope.favouriteElements.push(favouriteData);
  }
}
});
app.controller('dialogCtr',function ($scope, $mdDialog, locals) {
    //Assigned from construction <code>locals</code> options...
    $scope.locals = locals.phoneData;
    $scope.rate = locals.phoneData.rating;
    console.log($scope.rate);
    //console.log(locals);
  })

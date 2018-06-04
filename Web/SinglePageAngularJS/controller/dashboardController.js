app.controller('dashboardCtr', function($scope,$mdDialog,$rootScope) {

//console.log("dashboard");

$scope.showAdvanced = function(presentData) {
  console.log(presentData);
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
  $rootScope.favouriteElements.push(favouriteData);
  //console.log($scope.favouriteElements);
  console.log($rootScope.favouriteElements);
}


});
app.controller('dialogCtr',function ($scope, $mdDialog, locals) {
    // Assigned from construction <code>locals</code> options...
    $scope.locals = locals.phoneData;
    console.log(locals);
  })

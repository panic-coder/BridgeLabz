app.controller('dashboardCtr', function($scope,$mdDialog) {

console.log("dashboard");

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

});
app.controller('dialogCtr',function ($scope, $mdDialog, locals) {
    // Assigned from construction <code>locals</code> options...
    $scope.locals = locals.phoneData;
    console.log(locals);
  })

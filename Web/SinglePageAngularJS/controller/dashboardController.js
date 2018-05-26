app.controller('dashboardCtr', function($scope,$mdDialog) {

console.log("dashboard");

$scope.showAdvanced = function(ev,presentData) {
  console.log(presentData);
    $mdDialog.show({
      templateUrl: 'templates/popup.html',
      parent: angular.element(document.body),
      targetEvent: ev,
      clickOutsideToClose:true
    })}

    $scope.cancel = function() {
        $mdDialog.cancel();
    }

function dialogCtr($scope, $mdDialog, info) {
    // Assigned from construction <code>locals</code> options...
    $scope.info = info;
  }

});

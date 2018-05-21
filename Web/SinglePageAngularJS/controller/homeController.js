app.controller('homeCtr', function($scope,$mdSidenav) {
  $scope.consoleDisplay = function(){
    console.log($scope.user);
    console.log($scope.pass);
  }

$scope.toggleLeft = buildToggler('left');

  function buildToggler(componentId) {
    return function() {
      $mdSidenav(componentId).toggle();
    };
}
});

app.controller('homeCtr', function($scope) {
  $scope.consoleDisplay = function(){
    console.log($scope.user);
    console.log($scope.pass);
  }
});

app.controller('homeCtr', function($scope, $mdSidenav, readJsonData, $state, $mdDialog) {
  $scope.consoleDisplay = function() {
    console.log($scope.user);
    console.log($scope.pass);
  }

  $scope.toggleLeft = buildToggler('left');

  function buildToggler(id) {
    return function() {
      $mdSidenav(id).toggle();
  }
}
// function buildToggler(componentId){
//   if (!hidden) {
//     jq('#hideme').addClass('hidden');
//   } else {
//     jq
//   }
//
// }
  $scope.getData = readJsonData.getJson();
  $scope.getData.then(function(response) {
    $scope.data = response;
    console.log($scope.data);
  })

$state.go('home.dashboard');


});
// var e = document.getElementById(id);
// console.log(e.style.display);
// if(e.style.display == 'none' || e.style.display == ''){
//   e.classList.remove("md-closed");
//   e.style.display = 'block';
// }else{
//   e.classList.add("md-closed");
//   e.style.display = 'none';
// }

/// <reference path="angular.js"/>

var copyModule = angular
		  .module('moduleAddress', [])
          .controller('addressController', ['$scope', function($scope) {
            $scope.sa = {};
            $scope.ba = {};
    
            $scope.update = function(sa) {
              $scope.ba = angular.copy($scope.sa);
            };
    
          }]);

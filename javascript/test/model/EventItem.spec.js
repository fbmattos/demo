/**
 * DockerCon 2017 API
 * This is an exclusive API example for DockerCon 2017 participants.  Tips:   - To fork and work on your own version of this API, select 'Fork API' from the '...' menu   - To share and collaborate on your API, email us clicking below with subject line *\"Special trial for DockerCon participants\"*  Click below to email us: 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@swaggerhub.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.DockerCon2017Api);
  }
}(this, function(expect, DockerCon2017Api) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new DockerCon2017Api.EventItem();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('EventItem', function() {
    it('should create an instance of EventItem', function() {
      // uncomment below and update the code to test EventItem
      //var instane = new DockerCon2017Api.EventItem();
      //expect(instance).to.be.a(DockerCon2017Api.EventItem);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new DockerCon2017Api.EventItem();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new DockerCon2017Api.EventItem();
      //expect(instance).to.be();
    });

    it('should have the property _date (base name: "date")', function() {
      // uncomment below and update the code to test the property _date
      //var instane = new DockerCon2017Api.EventItem();
      //expect(instance).to.be();
    });

  });

}));

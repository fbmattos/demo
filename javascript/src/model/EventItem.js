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
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.DockerCon2017Api) {
      root.DockerCon2017Api = {};
    }
    root.DockerCon2017Api.EventItem = factory(root.DockerCon2017Api.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The EventItem model module.
   * @module model/EventItem
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>EventItem</code>.
   * @alias module:model/EventItem
   * @class
   * @param id {String} 
   * @param name {String} 
   * @param _date {String} 
   */
  var exports = function(id, name, _date) {
    var _this = this;

    _this['id'] = id;
    _this['name'] = name;
    _this['date'] = _date;
  };

  /**
   * Constructs a <code>EventItem</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EventItem} obj Optional instance to populate.
   * @return {module:model/EventItem} The populated <code>EventItem</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('date')) {
        obj['date'] = ApiClient.convertToType(data['date'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} date
   */
  exports.prototype['date'] = undefined;



  return exports;
}));



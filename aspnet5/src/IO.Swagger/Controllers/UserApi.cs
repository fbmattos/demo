/*
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Net;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using Swashbuckle.SwaggerGen.Annotations;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class UserApiController : Controller
    { 

        /// <summary>
        /// Create user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="body">Created user object</param>
        /// <response code="0">successful operation</response>
        [HttpPost]
        [Route("/org_test_040717_2/pet1/1.0.0/user")]
        [SwaggerOperation("CreateUser")]
        public virtual void CreateUser([FromBody]User body)
        { 
            throw new NotImplementedException();
        }


        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <remarks></remarks>
        /// <param name="body">List of user object</param>
        /// <response code="0">successful operation</response>
        [HttpPost]
        [Route("/org_test_040717_2/pet1/1.0.0/user/createWithArray")]
        [SwaggerOperation("CreateUsersWithArrayInput")]
        public virtual void CreateUsersWithArrayInput([FromBody]List<User> body)
        { 
            throw new NotImplementedException();
        }


        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        /// <remarks></remarks>
        /// <param name="body">List of user object</param>
        /// <response code="0">successful operation</response>
        [HttpPost]
        [Route("/org_test_040717_2/pet1/1.0.0/user/createWithList")]
        [SwaggerOperation("CreateUsersWithListInput")]
        public virtual void CreateUsersWithListInput([FromBody]List<User> body)
        { 
            throw new NotImplementedException();
        }


        /// <summary>
        /// Delete user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">The name that needs to be deleted</param>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        [HttpDelete]
        [Route("/org_test_040717_2/pet1/1.0.0/user/{username}")]
        [SwaggerOperation("DeleteUser")]
        public virtual void DeleteUser([FromRoute]string username)
        { 
            throw new NotImplementedException();
        }


        /// <summary>
        /// Get user by user name
        /// </summary>
        /// <remarks></remarks>
        /// <param name="username">The name that needs to be fetched. Use user1 for testing. </param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        [HttpGet]
        [Route("/org_test_040717_2/pet1/1.0.0/user/{username}")]
        [SwaggerOperation("GetUserByName")]
        [SwaggerResponse(200, type: typeof(User))]
        public virtual IActionResult GetUserByName([FromRoute]string username)
        { 
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<User>(exampleJson)
            : default(User);
            return new ObjectResult(example);
        }


        /// <summary>
        /// Logs user into the system
        /// </summary>
        /// <remarks></remarks>
        /// <param name="username">The user name for login</param>
        /// <param name="password">The password for login in clear text</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username/password supplied</response>
        [HttpGet]
        [Route("/org_test_040717_2/pet1/1.0.0/user/login")]
        [SwaggerOperation("LoginUser")]
        [SwaggerResponse(200, type: typeof(string))]
        public virtual IActionResult LoginUser([FromQuery]string username, [FromQuery]string password)
        { 
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            return new ObjectResult(example);
        }


        /// <summary>
        /// Logs out current logged in user session
        /// </summary>
        /// <remarks></remarks>
        /// <response code="0">successful operation</response>
        [HttpGet]
        [Route("/org_test_040717_2/pet1/1.0.0/user/logout")]
        [SwaggerOperation("LogoutUser")]
        public virtual void LogoutUser()
        { 
            throw new NotImplementedException();
        }


        /// <summary>
        /// Updated user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">name that need to be updated</param>
        /// <param name="body">Updated user object</param>
        /// <response code="400">Invalid user supplied</response>
        /// <response code="404">User not found</response>
        [HttpPut]
        [Route("/org_test_040717_2/pet1/1.0.0/user/{username}")]
        [SwaggerOperation("UpdateUser")]
        public virtual void UpdateUser([FromRoute]string username, [FromBody]User body)
        { 
            throw new NotImplementedException();
        }
    }
}

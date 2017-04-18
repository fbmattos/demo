/*
 * DockerCon 2017 API
 *
 * This is an exclusive API example for DockerCon 2017 participants.  Tips:   - To fork and work on your own version of this API, select 'Fork API' from the '...' menu   - To share and collaborate on your API, email us clicking below with subject line *\"Special trial for DockerCon participants\"*  Click below to email us: mailto:support@swaggerhub.com 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@swaggerhub.com
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
    public class SpeakersApiController : Controller
    { 

        /// <summary>
        /// Searches list of speakers
        /// </summary>
        /// <remarks>By passing in the appropriate options, you can search for speakers in the system </remarks>
        /// <param name="searchString">pass an optional search string for looking up speakers</param>
        /// <param name="skip">number of records to skip for pagination</param>
        /// <param name="limit">maximum number of records to return</param>
        /// <response code="200">Search results matching criteria</response>
        /// <response code="400">bad input parameter</response>
        [HttpGet]
        [Route("/DockerCon17/DockerCon17/1.0.0/speakers")]
        [SwaggerOperation("SpeakersGet")]
        [SwaggerResponse(200, type: typeof(List<SpeakerItem>))]
        public virtual IActionResult SpeakersGet([FromQuery]string searchString, [FromQuery]int? skip, [FromQuery]int? limit)
        { 
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<SpeakerItem>>(exampleJson)
            : default(List<SpeakerItem>);
            return new ObjectResult(example);
        }


        /// <summary>
        /// Adds a speaker
        /// </summary>
        /// <remarks>Adds a speaker to the system</remarks>
        /// <param name="speakerItem">Speaker to add</param>
        /// <response code="201">item created</response>
        /// <response code="400">invalid input, object invalid</response>
        /// <response code="409">an existing item already exists</response>
        [HttpPost]
        [Route("/DockerCon17/DockerCon17/1.0.0/speakers")]
        [SwaggerOperation("SpeakersPost")]
        public virtual void SpeakersPost([FromBody]SpeakerItem speakerItem)
        { 
            throw new NotImplementedException();
        }
    }
}

'use strict';

exports.speakersGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  * searchString (String)
  * skip (Integer)
  * limit (Integer)
  **/
    var examples = {};
  examples['application/json'] = [ {
  "profile" : "Ben Golub is a serial entrepreneur and start-up CEO, and the current CEO of Docker, the company behind the Docker open source platform, and the chief sponsor of the Docker ecosystem. Docker is an open platform for developers and system administrators to build, ship, run and orchestrate distributed applications. Prior to Docker, Golub was CEO of Gluster, the open source, scale out storage company, which was successfully acquired by Red Hat in 2011. Prior to Gluster, Golub was CEO of social media pioneer Plaxo, which was acquired by Comcast in 2008. Prior to Plaxo, Golub spent eight years at VeriSign, Inc., serving as Chief Marketing Officer, as Senior Vice President of the security and payments business, and as General Manager of VeriSign's managed security services business. Ben tweets at @golubbe",
  "name" : "BEN GOLUB",
  "id" : "12345",
  "title" : "CEO, Docker"
} ];
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.speakersPOST = function(args, res, next) {
  /**
   * parameters expected in the args:
  * speakerItem (SpeakerItem)
  **/
  // no response value expected for this operation
  res.end();
}


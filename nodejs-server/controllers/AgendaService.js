'use strict';

exports.agendaGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  * searchString (String)
  * skip (Integer)
  * limit (Integer)
  **/
    var examples = {};
  examples['application/json'] = [ {
  "date" : "2017-04-18T19:30:00.000Z",
  "name" : "After Party",
  "id" : "12345"
} ];
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

exports.agendaPOST = function(args, res, next) {
  /**
   * parameters expected in the args:
  * eventItem (AgendaItem)
  **/
  // no response value expected for this operation
  res.end();
}


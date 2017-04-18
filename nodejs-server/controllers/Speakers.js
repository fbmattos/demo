'use strict';

var url = require('url');


var Speakers = require('./SpeakersService');


module.exports.speakersGET = function speakersGET (req, res, next) {
  Speakers.speakersGET(req.swagger.params, res, next);
};

module.exports.speakersPOST = function speakersPOST (req, res, next) {
  Speakers.speakersPOST(req.swagger.params, res, next);
};

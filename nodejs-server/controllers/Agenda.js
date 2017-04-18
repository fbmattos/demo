'use strict';

var url = require('url');


var Agenda = require('./AgendaService');


module.exports.agendaGET = function agendaGET (req, res, next) {
  Agenda.agendaGET(req.swagger.params, res, next);
};

module.exports.agendaPOST = function agendaPOST (req, res, next) {
  Agenda.agendaPOST(req.swagger.params, res, next);
};

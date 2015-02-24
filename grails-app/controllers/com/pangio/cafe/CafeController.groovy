package com.pangio.cafe

import grails.rest.*

class CafeController extends RestfulController{

    static responseFormats = ['json','xml']

    CafeController() {
        super(Cafe)
    }
}

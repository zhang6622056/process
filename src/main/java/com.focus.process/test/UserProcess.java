package com.focus.process.test;

import com.focus.process.core.annotation.Process;
import com.focus.process.core.annotation.ProcessMethod;

/**
 *
 * Created by Nero on 2019-01-11.
 */
@Process(chianName="cart",next=TicketProcess.class)
public class UserProcess {





    @ProcessMethod
    public void start(String name1,String name2,String name3){

    }


}

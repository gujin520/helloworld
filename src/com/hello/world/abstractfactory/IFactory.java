package com.hello.world.abstractfactory;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * @author yangguanbao
 * @date 21/03/2017
 */
interface IFactry {
    BaseUpperWords makeUpperWordsObject();
    BaseLowerWords makeLowerWordsObject();
}

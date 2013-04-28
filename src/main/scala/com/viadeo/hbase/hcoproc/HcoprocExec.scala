package com.viadeo.hbase.hcoproc

import org.apache.hadoop.hbase.coprocessor.{RegionCoprocessorEnvironment, BaseEndpointCoprocessor}
import org.apache.hadoop.hbase.regionserver.HRegion
import org.apache.hadoop.hbase.HRegionInfo

/**
 * Created with IntelliJ IDEA.
 * User: viaduc446
 * Date: 26/04/13
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
@throws(classOf[java.io.IOException])
class HcoprocExec extends BaseEndpointCoprocessor with Hcoproc {

     def poll() : String = {
       val env=   getEnvironment.asInstanceOf[RegionCoprocessorEnvironment]
       val region:HRegion  = env.getRegion
       val r:HRegionInfo = region.getRegionInfo
       "regionNameAsString=" + r.getRegionNameAsString
     }
}


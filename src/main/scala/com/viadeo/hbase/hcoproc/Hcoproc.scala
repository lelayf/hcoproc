package com.viadeo.hbase.hcoproc

import org.apache.hadoop.hbase.ipc.CoprocessorProtocol;

trait Hcoproc extends CoprocessorProtocol {
  def poll() : String
}

package cn.nuct.bigdata.storm.wordcount;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

import java.util.Map;

public class MySpout extends BaseRichSpout {
    SpoutOutputCollector collector;

    // 初始化方法
    public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
        this.collector = collector;
    }

    // storm 框架在 while(true) 调用nextTuple方法
    // 该方法会被循环调用
    public void nextTuple() {
        collector.emit(new Values("I am LiLei love HanMeiMei"));
    }

    public void declareOutputFields(OutputFieldsDeclarer declarer) {
        declarer.declare(new Fields("love"));
    }
}

package mxappmetrics.impl;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.HashMap;
import java.util.Map;

public class ContainerMetricsReporter implements Runnable {
    private static ILogNode logger = Core.getLogger("ContainerMetricsReporter");

    @Override
    public void run() {

        try {
            logger.debug("Reporting container metrics");
            OperatingSystemMXBean osMxBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

            Map<String, String> tags = new HashMap<String, String>();
            Core.metrics().counters().count("mx.alive.ping", 1, tags);
            Core.metrics().gauges().recordValue("system.load.1", osMxBean.getSystemLoadAverage(), tags);
            Core.metrics().gauges().recordValue("system.mem.free", osMxBean.getFreePhysicalMemorySize(), tags);
            Core.metrics().gauges().recordValue("system.swap.free", osMxBean.getFreeSwapSpaceSize(), tags);
            Core.metrics().gauges().recordValue("system.mem.total", osMxBean.getTotalPhysicalMemorySize(), tags);
            Core.metrics().gauges().recordValue("system.swap.total", osMxBean.getTotalSwapSpaceSize(), tags);
            Core.metrics().gauges().recordValue("mx.concurrentsessions", Core.getNumberConcurrentSessions(), tags);
            Core.metrics().gauges().recordValue("mx.namedusercount", Core.getNamedUserCount(), tags);
            Core.metrics().gauges().recordValue("mx.concurrentusercount", Core.getConcurrentUserCount(false), tags);
            Core.metrics().gauges().recordValue("mx.concurrentanonymoususercount", Core.getConcurrentUserCount(true), tags);

//            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
//            String clusterId = System.getenv("CF_INSTANCE_INDEX");
//            String tags = String.format("jvmId:%s,cId:%s" ,jvmId,clusterId);
//            String hostname = InetAddress.getLocalHost().getHostName();
//            String jvmId = ManagementFactory.getRuntimeMXBean().getName();
//            Core.metrics().gauges().value("system.cpu.load", osMxBean.getSystemCpuLoad(), tags);
//            Core.metrics().gauges().value("mx.ProcessCpuLoad", osMxBean.getProcessCpuLoad(), tags);
//            Core.metrics().gauges().value("mx.ProcessCpuTime", osMxBean.getProcessCpuTime(), tags);
//            Core.metrics().gauges().value("mx.CommittedVirtualMemorySize", osMxBean.getCommittedVirtualMemorySize(), tags);
//            Core.metrics().gauges().value("mx.JvmTotalMemory", Runtime.getRuntime().totalMemory(), tags);
//            Core.metrics().gauges().value("mx.JvmFreeMemory", Runtime.getRuntime().freeMemory(), tags);
//            Core.metrics().gauges().value("mx.JvmMaxMemory", Runtime.getRuntime().maxMemory(), tags);
//            Core.metrics().gauges().value("mx.JvmAvailableProcessors", Runtime.getRuntime().availableProcessors(), tags);
//            Core.metrics().gauges().value("mx.JvmUptime", runtimeMXBean.getUptime(), tags);
//            Core.metrics().gauges().value("mx.concurrentusercount",Core.,tags);
        } catch (Exception e) {
//            dumpStackTrace(e);
            logger.warn("Failed to report container metrics", e);
        }
    }


}

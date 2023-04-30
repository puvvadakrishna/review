# review

Config: An Executed be thread pool is created to make the logger calls, lightweight considering the heavy usage
 
All the logger methods has be enhance to accept Object(support any primitive/user-defined datatype)

Based on the log.properties configuration, the respective debug, info, and warn will be logged, debug will log support all log methods, info support info and error, the error only logs error
 
The implementation of LoggerTarget are FileLogger, ConsoleLogger & EmailLogger, based on the property defied a log.properties file, respective bean will be injected at runtime.
How-every, we can enhance it to support multiple loggers

To support multi-Threading, in each method, there is a Thread name added to the message, However, due to the implementation of Aysn, a separate thread name will be printed. We need to set the parent thread name / CorrelationId in ThreadContext/ThreadLocal(MD) and need to fetch it.

NOTE: The current implementation will not work for wrong package/ error is printed on the console if tried to get the logger object

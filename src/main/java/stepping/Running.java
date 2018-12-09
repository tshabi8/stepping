package stepping;

import java.util.concurrent.Future;

class Running extends IRunning {
     private Future future;

     protected Running(String id, Runnable runnable) {
         this.id = id;
         this.runnable = runnable;
     }

     protected Future<?> awake() {
         if (runnable != null) {
             this.future = executorService.submit(runnable);
             return future;
         }
         throw new RuntimeException("Can't awake empty Runnable");
     }

     @Override
     public void close() {
         close(future);
     }
 }
package edu.upc.eetac.dsa.beeter.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by hixam on 23/03/16.
 */
public class BeeterError{
    @JsonInclude(JsonInclude.Include.NON_NULL)
        private int status;
        private String reason;

        public BeeterError(int status, String reason) {
            this.status = status;
            this.reason = reason;
        }

        public BeeterError() {
        }
        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
}

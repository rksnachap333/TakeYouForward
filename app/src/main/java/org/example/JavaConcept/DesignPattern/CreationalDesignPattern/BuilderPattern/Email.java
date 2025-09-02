package org.example.JavaConcept.DesignPattern.CreationalDesignPattern.BuilderPattern;

import java.util.List;

//Example of a builder pattern
public class Email {


    // Required field
    private final String to;
    private final String from;

    //optional field
    private final String subject;
    private final String cc;
    private final String body;
    private final List<String> attachment;

    private Email(Builder builder) {
        this.to = builder.to;
        this.from = builder.from;
        this.subject = builder.subject;
        this.cc = builder.cc;
        this.body = builder.body;
        this.attachment = builder.attachment;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getCc() {
        return cc;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachment() {
        return attachment;
    }

    public static class Builder {

        // Required field
        private final String to;
        private final String from;

        //optional field
        private String subject;
        private String cc;
        private String body;
        private List<String> attachment;


        public Builder(String to, String from) {
            this.to = to;
            this.from = from;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder cc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        public Builder attachment(List<String> attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email build() {
            return new Email(this);
        }

    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", cc='" + cc + '\'' +
                ", body='" + body + '\'' +
                ", attachment=" + attachment +
                '}';
    }
}

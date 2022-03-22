package com.redhat.cloud.notifications.routers.internal.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class InternalUserPermissions {
    public static class Application {
        private UUID id;
        private String displayName;

        public Application() {

        }

        public Application(UUID id, String displayName) {
            this.id = id;
            this.displayName = displayName;
        }

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName() {
            this.displayName = displayName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (!(o instanceof Application)) {
                return false;
            }

            Application that = (Application) o;
            return Objects.equals(id, that.id) && Objects.equals(displayName, that.displayName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, displayName);
        }
    }

    private boolean isAdmin;
    private final List<Application> applications = new ArrayList<>();

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void addApplication(UUID id, String displayName) {
        this.applications.add(new Application(id, displayName));
    }
}

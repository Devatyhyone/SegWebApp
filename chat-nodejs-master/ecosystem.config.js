module.exports = {
  apps: [
    {
      name: "chat-nodejs",
      script: "src/index.js",
      watch: true,
      instances: 1,
      autorestart: true,
      ignore_watch: ["node_modules", "data", "./logs"],
      restart_delay: 10000,
    },
  ],
  env: {
    NODE_ENV: "development",
  },
  env_production: {
    NODE_ENV: "production",
  },
  deploy: {
    production: {
      user: "node",
      host: "",
      ref: "origin/master",
      repo: "git@github.com:repo.git",
      path: "/var/www/production",
      "post-deploy":
        "npm install && pm2 reload ecosystem.config.js --env production",
    },
  },
};

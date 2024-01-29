const gulp = require('gulp');
const postcss = require('gulp-postcss');
const uglifycss = require('gulp-uglifycss');
const babel = require('gulp-babel');
const terser = require('gulp-terser');
const browserSync = require('browser-sync').create();

// Tasks for copying HTML, CSS, and JS

gulp.task('copy-html', () => {
  return gulp.src(['src/main/resources/**/*.html'])
    .pipe(gulp.dest('target/classes/'));
});

gulp.task('copy-css', () => {
  return gulp.src(['src/main/resources/**/*.css'])
    .pipe(postcss())
    .pipe(uglifycss())
    .pipe(gulp.dest('target/classes/'));
});

gulp.task('copy-js', () => {
  return gulp.src(['src/main/resources/**/*.js'])
    .pipe(babel())
    .pipe(terser())
    .pipe(gulp.dest('target/classes/'));
});

// Combined tasks for copying HTML, CSS, and JS

gulp.task('copy-html+css-and-reload', gulp.series('copy-html', 'copy-css', reload));
gulp.task('copy-css-and-reload', gulp.series('copy-css', reload));
gulp.task('copy-js-and-reload', gulp.series('copy-js', reload));

// Build task

gulp.task('build', gulp.series('copy-html', 'copy-css', 'copy-js'));

// Default task with watch and browserSync

gulp.task('default', gulp.series('watch'));

function reload(done) {
  browserSync.reload();
  done();
}

// Watch task

// gulp.task('watch', () => {
//   browserSync.init({
//     server: {
//       baseDir: 'target/classes/'
//     }
//   });

//   // Watch for changes and trigger respective tasks

//   gulp.watch(['src/main/resources/**/*.html'], gulp.series('copy-html+css-and-reload'));
//   gulp.watch(['src/main/resources/**/*.css'], gulp.series('copy-css-and-reload'));
//   gulp.watch(['src/main/resources/**/*.js'], gulp.series('copy-js-and-reload'));
// });

gulp.task('watch', () => {
  browserSync.init({proxy: 'localhost:8080'});

  gulp.watch(['src/main/resources/**/*.html'], gulp.series('copy-html+css-and-reload'));
  gulp.watch(['src/main/resources/**/*.svg'], gulp.series('copy-svg+css-and-reload'));
  gulp.watch(['src/main/resources/**/*.css'], gulp.series('copy-css-and-reload'));
  gulp.watch(['src/main/resources/**/*.js'], gulp.series('copy-js-and-reload'));
});

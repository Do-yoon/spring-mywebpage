<template>
  <div class="intro">
    <h1>{{ name }}</h1>
    <h2>{{ dev_position }}</h2>
    <ul>
      <li>
        <a
          href="https://docs.google.com/document/d/1IXrZy-pWuU81z64PHEWJwUJ4_bWIkyrN9JbDStxKEqM/edit"
          target="_blank"
        >
          CV
        </a>
      </li>

      <li>
        <a
          href="https://github.com/Do-yoon"
          target="_blank"
        >
          Github
        </a>
      </li>
    </ul>
    <ul>
      <li>
        <a
          href="https://blog.naver.com/cheeezing_u"
          target="_blank"
        >
          Blog
        </a>
      </li>
      <li>
        <a
          href="https://www.linkedin.com/in/doyoon-kim-34657b14a/"
          target="_blank"
        >
          LinkedIn
        </a>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data () {
    return {
      msg: 'Doyoon Kim',
      dev_position: 'Junior Developer'
    }
  }
}
</script>

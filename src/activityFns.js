export function prefix(location, ...prefixes) {
  return prefixes.some(
    prefix => (
      location.href.indexOf(`${location.origin}/${prefix}`) !== -1
    )
  )
}

export function navbar(location) {
  return true
}

export function people(location) {
  return prefix(location, 'people')
}

export function shadow(location) {
  return prefix(location, 'shadow')
}


export function planets(location) {
  return prefix(location, 'planets')
}
